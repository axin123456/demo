package com.orbyun.visitor;

/**
 * @author chenjixin
 * @date 2019-11-25 16:19
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作:" + commonEmployee.getJob() + "\t";
        return basicInfo+otherInfo;
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名:" + employee.getName() + "\t";
        info = info + "性别:" + (employee.getSex() == Employee.FEMALE ? "女" : "男");
        info = info + "薪水:" + employee.getSalary() + "\t";
        return info;
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getManagerInfo(Manager manager) {

        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩:" + manager.getPerformance() + "\t";
        return basicInfo+otherInfo;
    }
}
