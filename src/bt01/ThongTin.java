package bt01;

public class ThongTin {
    public static void main(String[] args) {
        System.out.println("Thông tin nhân viên: ");

        NhanVien nhanVien = new NhanVien();

        System.out.println("Tên nhân viên: " + nhanVien.TenNhanVien);
        System.out.println("Tuổi: " + nhanVien.Tuoi);
        System.out.println("Email: " + nhanVien.Email);
        System.out.println("Địa chỉ: " + nhanVien.Diachi);
        System.out.println("Số điện thoại: " + nhanVien.Sodienthoai);

    }
}
