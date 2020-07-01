package M;
/*
*author：王一卓
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ThingList{
	private Map<Integer,Thing> list=new HashMap<Integer,Thing>();

    public  boolean del(int id){
    	if(!list.containsKey(id))
    		return false;
        list.remove(id);
        return true;
    }
    
    public void edit(int id,boolean flag){
        Thing th=null;
        th = list.get(id);
        th.setFlag(flag);
        list.put(id,th);
    }
    
    public String toString(){
    	String res = "";
        Set<Integer> keys=list.keySet();//取出所有key的集合
        Iterator<Integer> it=keys.iterator();//获取Iterator对象
        while(it.hasNext()){
            Integer key=it.next();  //取出key
            Thing th = list.get(key);  //根据key取出对应的值
            res += th.toString()+"\n";
        }
        return res;
    }
	public void add(Thing thing) {
		list.put(thing.getID(), thing);
		
	}
    public static void main(String[] args){
    	Scanner input=new Scanner(System.in);
        int end=0;
        ThingList list = new ThingList();
        while(end==0){
        	 System.out.println("菜单：-----------------");
             System.out.println("1：打印所有事项。");
             System.out.println("2：删除对应序号的事项。");
             System.out.println("3：增加事项。");
             System.out.println("4：修改相应事项为完成。");
             System.out.println("5：退出");
             int ch=input.nextInt();
             switch(ch){
             	case 1:
             		System.out.println(list.toString());
             		break;
             	case 2:
             		System.out.println("请输入你要删除的事项的序号：");
             		int i=input.nextInt();
             		list.del(i);
             		break;
             	case 3:
             		int id = 0,year = 0,month = 0,day = 0;
             		System.out.println("请输入事项的序号：");
             		id = input.nextInt();
             		System.out.println("请输入事项的年份：");
             		year = input.nextInt();
             		System.out.println("请输入事项的月份：");
             		month = input.nextInt();
             		System.out.println("请输入事项的日期：");
             		day = input.nextInt();
             		String text = input.nextLine();
             		list.add(new Thing(id,year,month,day,text));
             		break;
             	case 4:
             		System.out.println("请输入你要修改的事项的序号：");
             		id=input.nextInt();
             		System.out.println("请输入你要修改事项的状态(0:false,1:true)：");
             		int flag = input.nextInt();
             		list.edit(id,flag==1);
             		break;
             	case 5:
             		end=1;
             		break;
             	default:
             		System.out.println("请重新输入：");
             		break;
             }
        }
    }
}

