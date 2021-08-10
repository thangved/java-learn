package baitap.date;

import elsectu.MyUtil;

public class Date {
    private int ngay, thang, nam;

    public static void main(String[] args) {
        Date d = new Date(29, 10, 2002);

        d.congNgay(120);
    }

    public Date(){
        setNgay(1);
        setThang(1);
        setNam(1);
    }

    public Date(int ngay, int thang, int nam){
        setNgay(ngay);
        setThang(thang);
        setNam(nam);
    }

    public void hienThi(){
        System.out.println(ngay + '/' + thang + '/' + nam);
    }

    public void nhap(){
        int ngay, thang, nam;

        System.out.println("Hãy nhập ngày tháng năm.");

        ngay = MyUtil.scanner.nextInt();
        thang = MyUtil.scanner.nextInt();
        nam = MyUtil.scanner.nextInt();

        if (hopLe(ngay, thang, nam)){

            setNgay(ngay);
            setThang(thang);
            setNam(nam);

        }
        else {
            System.out.println("Ngày tháng năm không hợp lệ.");
            nhap();
        }

    }

    private boolean hopLe(int ngay, int thang, int nam){
        if (ngay < 1 || ngay > 31)
            return false;
        if (thang==2){
            if (namNhuan(nam)){
                return ngay < 30;
            }
            return ngay < 29;
        }

        if (thang == 4 || thang == 6 || thang == 9 || thang == 11){
            return ngay < 31;
        }

        return true;

    }

    private boolean namNhuan(int nam){
        return (nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0;
    }

    public void congNgay(int ngay){
        int tong = getNgay() + ngay;

        if (tong > ngayTrongThang()){
            setNgay(1);
            setThang(getThang() + 1);
            congNgay(tong - ngayTrongThang() - 2);
        }
        else{
            setNgay(getNgay() + ngay);
        }
    }

    private int ngayTrongThang(){
        if (thang == 2){
            if (namNhuan(nam)){
                return 29;
            }
            return 28;
        }

        if(thang == 4 || thang == 6 ||  thang == 9 || thang == 11)
            return 30;

        return 31;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }
}
