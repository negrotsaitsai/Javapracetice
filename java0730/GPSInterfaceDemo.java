
interface GPS
{
	void 導航裝置();
	void mp3播放();
}
class 腳踏車 implements GPS
{
	public void  導航裝置()
	{
		System.out.println("街頭小巷導航");		
	}
	public void mp3播放()
	{
		
	}
}
class 機車 implements GPS
{
	public void  導航裝置()
	{
	   System.out.println("街頭小巷導航+偵測是否有警察");			
	}
	public void mp3播放()
	{
		
	}
}
class 汽車 implements GPS
{
	public void  導航裝置()
	{
		 System.out.println("街頭小巷,高速公路導航+偵測是否有警察+測速照像");			
	}
	public void mp3播放()
	{
		
	}
}

public class GPSInterfaceDemo {

    public GPSInterfaceDemo() {
    }
    public static void main (String[] args) {
         腳踏車  b=new 腳踏車();	
    }
    
}