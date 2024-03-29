
public class HoaDonNhapHang extends HoaDon {
    private String madt;
    private int diemdt;

    public HoaDonNhapHang(String madt, int diemdt) {
        this.madt = madt;
        this.diemdt = diemdt;
    }

    public HoaDonNhapHang(String mahd, String matk, Ngay ngay, QuanLiSanPham dssp, String madt, int diemdt) {
        super(mahd, matk, ngay, dssp);
        this.madt = madt;
        this.diemdt = diemdt;
    }

    public HoaDonNhapHang() {
    }

    public String getMadt() {
        return madt;
    }

    public void setMadt(String madt) {
        this.madt = madt;
    }

    public int getDiemdt() {
        return diemdt;
    }

    public void setDiemdt(int diemdt) {
        this.diemdt = diemdt;
    }

    public void xuatHoaDonNhapHang() {
        System.out.println("Mã đối tác: " + madt + "\nĐiểm đối tác: " + diemdt);
        super.xuatHoaDon();
    }
}
