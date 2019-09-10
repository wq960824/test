import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spider {
    public static void main(String[] args) {
        String address ="http://www.netbian.com/index.htm";
        System.out.println("爬取http://www.netbian.com图片");
        System.out.println("图片将保存至d:/java/picture");
        System.out.println("请输入从第几页开始爬取:");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("爬取页数:");
        int m = scanner.nextInt();
        if (n <1) {
            System.out.println("页码小于1");
            System.exit(0);
        }else if(n > 1) {
            String snum = String.valueOf(n);
            address = "http://www.netbian.com/index_"+snum+".htm";
        }

        for(;m>=1;m--) {
            String h = getHtm(address);
            //提取图片url
            Pattern imgpattern=Pattern.compile("http://img\\.netbian\\.com/file/.*?\\.jpg");
            Matcher imgmatcher=imgpattern.matcher(h);
            while (imgmatcher.find()){

                String imgString=imgmatcher.group();
                String[]  strs=imgString.split("/");
                String name = strs[strs.length-1];
                String path = "e:/upload/picture/"+name;
                downloadPicture(imgString,path);
                //更新下一页address
                String snum = String.valueOf(n+1);
                address = "http://www.netbian.com/index_"+snum+".htm";
            }
        }
    }

    private static String getHtm(String address){
        HttpURLConnection conn = null;
        URL url = null;
        InputStream in = null;
        BufferedReader reader = null;
        StringBuffer stringBuffer = null;
        try {
            url = new URL(address);
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.setDoInput(true);
            conn.connect();
            in = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(in));
            stringBuffer = new StringBuffer();
            String line = null;
            while((line = reader.readLine()) != null){
                stringBuffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.disconnect();
            try {
                in.close();
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return stringBuffer.toString();
    }

    private static void downloadPicture(String imageurl,String path) {
        try {
            URL url = new URL(imageurl);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());

            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
                System.out.println(imageurl);
            }
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
