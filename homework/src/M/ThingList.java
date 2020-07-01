package M;
/*
*author����һ׿
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
        Set<Integer> keys=list.keySet();//ȡ������key�ļ���
        Iterator<Integer> it=keys.iterator();//��ȡIterator����
        while(it.hasNext()){
            Integer key=it.next();  //ȡ��key
            Thing th = list.get(key);  //����keyȡ����Ӧ��ֵ
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
        	 System.out.println("�˵���-----------------");
             System.out.println("1����ӡ�������");
             System.out.println("2��ɾ����Ӧ��ŵ����");
             System.out.println("3���������");
             System.out.println("4���޸���Ӧ����Ϊ��ɡ�");
             System.out.println("5���˳�");
             int ch=input.nextInt();
             switch(ch){
             	case 1:
             		System.out.println(list.toString());
             		break;
             	case 2:
             		System.out.println("��������Ҫɾ�����������ţ�");
             		int i=input.nextInt();
             		list.del(i);
             		break;
             	case 3:
             		int id = 0,year = 0,month = 0,day = 0;
             		System.out.println("�������������ţ�");
             		id = input.nextInt();
             		System.out.println("�������������ݣ�");
             		year = input.nextInt();
             		System.out.println("������������·ݣ�");
             		month = input.nextInt();
             		System.out.println("��������������ڣ�");
             		day = input.nextInt();
             		String text = input.nextLine();
             		list.add(new Thing(id,year,month,day,text));
             		break;
             	case 4:
             		System.out.println("��������Ҫ�޸ĵ��������ţ�");
             		id=input.nextInt();
             		System.out.println("��������Ҫ�޸������״̬(0:false,1:true)��");
             		int flag = input.nextInt();
             		list.edit(id,flag==1);
             		break;
             	case 5:
             		end=1;
             		break;
             	default:
             		System.out.println("���������룺");
             		break;
             }
        }
    }
}

