package com.vti.backend;

import com.vti.entity.*;

import java.util.Date;

import static java.lang.System.out;
public class Program {
    public static void main(String[] args) {
        //Question 2:
        //Tạo file Program.java có chứa main() method và khởi tạo ít nhất 3 đối tượng
        //đối với mỗi table trong java

        // tạo Department
        Department d1 = new Department();
        d1.departmentID = 1;
        d1.departmentName = "sale";

        Department d2 = new Department();
        d2.departmentID = 2;
        d2.departmentName = "Marketing";

        Department d3 = new Department();
        d3.departmentID = 3;
        d3.departmentName = "IT";

        // tạo Position
        Position p1 = new Position();
        p1.positionID = 1;
        p1.positionName = PositionEnum.DEV;

        Position p2 = new Position();
        p2.positionID = 2;
        p2.positionName = PositionEnum.TEST;

        Position p3 = new Position();
        p3.positionID = 3;
        p3.positionName = PositionEnum.SCRUM_MASTER;


        // tạo Account
        Account a1 = new Account();
        a1.accountID = 1;
        a1.email = "hưng@gmail.com";
        a1.username = "hưng";
        a1.fullName = "Nguyễn văn hưng";
        a1.department = d1;
        a1.position = p1;
        a1.createDate = new Date();

        Account a2 = new Account();
        a2.accountID = 2;
        a2.email = "hoa@gmail.com";
        a2.username = "hoa";
        a2.fullName = "Nguyễn thị hoa";
        a2.department = d2;
        a2.position = p2;
        a2.createDate = new Date();

        Account a3 = new Account();
        a3.accountID = 3;
        a3.email = "kỵ@gmail.com";
        a3.username = "kỵ";
        a3.fullName = "Trương vô kỵ";
        a3.department = d3;
        a3.position = p3;
        a3.createDate = new Date();

        // ===== 4. Group =====
        Group g1 = new Group();
        g1.groupID = 1;
        g1.groupName = "Java Fresher";
        g1.creator = a1;
        g1.createDate = new Date();

        Group g2 = new Group();
        g2.groupID = 2;
        g2.groupName = "Backend Team";
        g2.creator = a2;
        g2.createDate = new Date();

        Group g3 = new Group();
        g3.groupID = 3;
        g3.groupName = "Testing Team";
        g3.creator = a3;
        g3.createDate = new Date();

        // ===== 5. GroupAccount =====
        GroupAccount ga1 = new GroupAccount();
        ga1.group = g1;
        ga1.account = a1;
        ga1.joinDate = new Date();

        GroupAccount ga2 = new GroupAccount();
        ga2.group = g1;
        ga2.account = a2;
        ga2.joinDate = new Date();

        GroupAccount ga3 = new GroupAccount();
        ga3.group = g2;
        ga3.account = a3;
        ga3.joinDate = new Date();

        // ===== 6. TypeQuestion =====
        TypeQuestion tq1 = new TypeQuestion();
        tq1.typeID = 1;
        tq1.typeName = TypeQuestionEnum.ESSAY;

        TypeQuestion tq2 = new TypeQuestion();
        tq2.typeID = 2;
        tq2.typeName = TypeQuestionEnum.MULTIPLE_CHOICE;

        TypeQuestion tq3 = new TypeQuestion();
        tq3.typeID = 3;
        tq3.typeName = TypeQuestionEnum.ESSAY;

        // ===== 7. CategoryQuestion =====
        CategoryQuestion cq1 = new CategoryQuestion();
        cq1.categoryID = 1;
        cq1.categoryName = "Java";

        CategoryQuestion cq2 = new CategoryQuestion();
        cq2.categoryID = 2;
        cq2.categoryName = "SQL";

        CategoryQuestion cq3 = new CategoryQuestion();
        cq3.categoryID = 3;
        cq3.categoryName = "Postman";

        // ===== 8. Question =====
        Question q1 = new Question();
        q1.questionID = 1;
        q1.content = "Java là gì?";
        q1.category = cq1;
        q1.type = tq1;
        q1.creator = a1;
        q1.createDate = new Date();

        Question q2 = new Question();
        q2.questionID = 2;
        q2.content = "SQL JOIN là gì?";
        q2.category = cq2;
        q2.type = tq2;
        q2.creator = a2;
        q2.createDate = new Date();

        Question q3 = new Question();
        q3.questionID = 3;
        q3.content = "Postman dùng để làm gì?";
        q3.category = cq3;
        q3.type = tq1;
        q3.creator = a3;
        q3.createDate = new Date();

        // ===== 9. Answer =====
        Answer ans1 = new Answer();
        ans1.answerID = 1;
        ans1.content = "Java là ngôn ngữ lập trình";
        ans1.questionID = q1;
        ans1.isCorrect = true;

        Answer ans2 = new Answer();
        ans2.answerID = 2;
        ans2.content = "JOIN dùng để nối bảng";
        ans2.questionID = q2;
        ans2.isCorrect = true;

        Answer ans3 = new Answer();
        ans3.answerID = 3;
        ans3.content = "Postman dùng test API";
        ans3.questionID = q3;
        ans3.isCorrect = true;

        // ===== 10. Exam =====
        Exam e1 = new Exam();
        e1.examID = 1;
        e1.code = "EX001";
        e1.title = "Java Basic";
        e1.category = cq1;
        e1.duration = 60;
        e1.creator = a1;
        e1.createDate = new Date();

        Exam e2 = new Exam();
        e2.examID = 2;
        e2.code = "EX002";
        e2.title = "SQL Basic";
        e2.category = cq2;
        e2.duration = 45;
        e2.creator = a2;
        e2.createDate = new Date();

        Exam e3 = new Exam();
        e3.examID = 3;
        e3.code = "EX003";
        e3.title = "Postman Test";
        e3.category = cq3;
        e3.duration = 30;
        e3.creator = a3;
        e3.createDate = new Date();

        // ===== 11. ExamQuestion =====
        ExamQuestion eq1 = new ExamQuestion();
        eq1.exam = e1;
        eq1.questionID = q1;

        ExamQuestion eq2 = new ExamQuestion();
        eq2.exam = e2;
        eq2.questionID = q2;

        ExamQuestion eq3 = new ExamQuestion();
        eq3.exam = e3;
        eq3.questionID = q3;

        //Question 3:
        //Trong file Program.java, hãy in ít nhất 1 giá trị của mỗi đối tượng ra
        System.out.println("==============Question 3:Trong file Program.java, hãy in ít nhất 1 giá trị của mỗi đối tượng ra==============");
        System.out.println( "Phòng ban: " +
                "ID: " + d1.departmentID +
                " Tên: " + d1.departmentName);

        System.out.println( "Chức vụ: "+"\n" +
                "ID: " + p1.positionID +
                " Tên: " + p1.positionName);

        System.out.println( "NHóm: "+"\n" +
                "ID: " + g1.groupID +
                " Tên: " + g1.groupName + "\n" +
                " ID:" + g1.creator +
                "Ngày Tạo" + g1.createDate);

        System.out.printf("ID Nhóm: %-5d Tên Nhóm: %-15s | ID Thành viên: %-5d Tên: %-20s | Ngày tạo: %s%n",
                ga1.group.groupID, ga1.group.groupName,
                ga1.account.accountID, ga1.account.fullName,
                ga1.joinDate);
        System.out.println("|---------------------|---------------------|");
        System.out.printf  ("|Định danh câu hỏi: %-11d | loại Câu hỏi: %-20s ",
                tq1.typeID,tq1.typeName);
    }


}
