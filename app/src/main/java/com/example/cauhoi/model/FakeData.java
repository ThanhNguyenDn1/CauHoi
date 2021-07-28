package com.example.cauhoi.model;

import java.util.ArrayList;

public class FakeData
{
    public ArrayList<CauHoi> ListQuestion;

    public ArrayList<CauHoi> getListQuestion() {
        return ListQuestion;
    }

    public FakeData() {
        ArrayList<CauHoi> listQuestion = new ArrayList<>();
        listQuestion.add(new CauHoi("Đâu là con mèo?",1,new String[]{"image/conBo.jpg","image/conMeo.jpg","image/conVit.jpeg","image/conCho.jpg"} ,"image/conMeo.jpg"));
        listQuestion.add(new CauHoi("Đâu là con gà?",1,new String[]{"image/conGa.jpg","image/conCho.jpg","image/conMeo.jpg","image/conVit.jpeg",} ,"image/conGa.jpg"));
        listQuestion.add(new CauHoi("Đâu là biểu tượng đại học mỏ?",1,new String[]{"image/LogoApple.png","image/logoBHX.png","image/logoMo.jpg","image/logoHonda.jpg"} ,"image/logoMo.jpg"));
        listQuestion.add(new CauHoi("Đâu là thương hiệu Việt Nam?",1,new String[]{"image/samsung.png","image/xiaomi.jpg","image/vgr.png","image/yamaha.jpg"} ,"image/vgr.png"));
        listQuestion.add(new CauHoi("Đâu là người yêu bạn?",1,new String[]{"image/tdb.jpg","image/tac.jpg","image/hs.jpg","image/sv.jpg"} ,"image/tac.jpg"));
        ListQuestion = listQuestion;
    }
}
