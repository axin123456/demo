package com.orbyun.LawOfDemeter;

/**
 * @author chenjixin
 * @date 2019-11-25 13:24
 */
public class Client {
    public static void main(String[] args) {
        InstallWizard installWizard=new InstallWizard();
        installWizard.installWizard(new Wizard());
    }
}
