package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {

    private MemberDao memberDao;
    private MemberRegisterService regSvc;
    private ChangePasswordService pwdSvc;

    //의존 객체를 변경하려면 조립기의 코드만 수정하면 됨
    public Assembler() {
        memberDao = new MemberDao(); //new CachedMemberDao();
        regSvc = new MemberRegisterService(memberDao);
        pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
    }

    public MemberDao getMemberDao() {
        return memberDao;
    }

    public ChangePasswordService getChangePasswordService() {
        return pwdSvc;
    }

    public MemberRegisterService getMemberRegisterService() {
        return regSvc;
    }
}
