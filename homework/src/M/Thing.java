package M;
/*
 autohr： 李明东
 */
public class Thing{
    private int year;
    private int day;
    private int month;
    private String text;
    private Integer id;
    private boolean flag;
    Thing(int id, int year,int month,int day,String text){
    	this.id = id;
    	this.year = year;
    	this.month = month;
    	this.day = day;
    	this.id = id;
    	this.text = text;
    }
    public String toString() {
		return Integer.toString(id) +" "
				+ Integer.toString(year)+"年"
				+ Integer.toString(month)+"月"
				+ Integer.toString(day) + "日: "
				+ text
				+ " 状态: " + flag;
    }
    public void setID(Integer i){
        id=i;
    }
    public Integer getID(){
        return id;
    }
    public void setYear(int y){
        year=y;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int m){
        month=m;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int d){
        day=d;
    }
    public int getDay(){
        return day;
    }
    public void setFlag(boolean f){
        flag=f;
    }
    public boolean getFlag(){
        return flag;
    }
    public void setText(String t){
        text=t;
    }
    public String getText(){
        return text;
    }
    
}