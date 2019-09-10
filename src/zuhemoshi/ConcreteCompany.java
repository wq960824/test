package zuhemoshi;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> children=new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void Add(Company company) {
        children.add(company);
    }

    @Override
    public void Remove(Company company) {
        int i=children.indexOf(company);
        if (i>=0){
            children.remove(company);
        }
    }

    @Override
    public Company Display(int  depth) {
        return children.get(depth);
    }

    @Override
    public void LineOfDuty(Company company) {

    }
}
