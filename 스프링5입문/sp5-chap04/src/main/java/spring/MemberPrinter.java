package spring;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MemberPrinter {

    private DateTimeFormatter dateTimeFormatter;

    public void print(Member member) {
        System.out.printf("회원 정보 : 아이디 = %d, 이메일=%s, 이름=%s, 등록일=%tF\n", member.getId(),
                member.getEmail(), member.getName(), member.getRegisterDateTime());
    }

    public void setDateFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }
}
