package zuhemoshi;
//公司抽象类
abstract class Company {
    protected  String name;

    public Company(String name){
        this.name=name;
    }
    public abstract void Add(Company company);//增加
    public abstract void Remove(Company company);//删除
    public abstract Company Display(int  depth);//显示
    public abstract void LineOfDuty(Company company);//履行职责
}
