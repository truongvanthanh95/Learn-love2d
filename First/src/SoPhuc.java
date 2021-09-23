
public class SoPhuc {
	private double phanThuc;
	private double phanAo;
	public SoPhuc(double phanThuc, double phanAo)
	{
		this.phanThuc = phanThuc;
		this.phanAo = phanAo;
	}
	public SoPhuc cong(SoPhuc khac)
	{
		return new SoPhuc(this.phanThuc + khac.phanThuc, this.phanAo + khac.phanAo);
	}
	public SoPhuc tru(SoPhuc khac)
	{
		return new SoPhuc(this.phanThuc - khac.phanThuc, this.phanAo - khac.phanAo);
	}
	public double layModun()
	{
		return Math.hypot(this.phanThuc, this.phanAo);
	}
	public SoPhuc layLienHop()
	{
		return new SoPhuc(this.phanThuc, -this.phanAo);
	}
}
