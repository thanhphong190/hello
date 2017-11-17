import java.lang.*;
import java.io.*;
import java.util.Date;
class SVien 
{
	private  String hoTen;
	private Date ngaySinh;
	private double dtb;
	public SVien(String ht,Date ns,double d)
	{
		hoTen= ht;
		ngaySinh=ns;
		dtb=d;
	}
	public String layHoten()
	{
		return hoTen;
	}
	public void sethoTen(String ht)
	{
		this.hoTen=ht;
	}
}
