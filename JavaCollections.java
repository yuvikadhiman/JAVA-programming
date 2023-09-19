import java.util.*;  
// class javaCollections{
//     public static void main (String args[]){
//         ArrayList<String> list=new ArrayList<>(5);
//        list.add("anna");
//        list.add("john");
//        list.add("peter");

//     //    for(int i=0;i<list.size();i++){
//     //     System.out.println(list.get(i));
//     //    }
//         Iterator i=list.iterator();
//         while(i.hasNext()){
//             System.out.println(i.next());
//         }
        
//     }
// }

// class javaCollections{
//     public static void main (String args[]){
//         LinkedList <String> list=new LinkedList<String>();
//        list.add("anna");
//        list.add("john");
//        list.add("peter");

//     //    for(int i=0;i<list.size();i++){
//     //     System.out.println(list.get(i));
//     //    }
//         Iterator i=list.iterator();
//         while(i.hasNext()){
//             System.out.println(i.next());
//         }
        
//     }
// }
import java.util.*;


class javaCollections{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrayList: ");
        int count = sc.nextInt();
        
        ArrayList<String> students = new ArrayList<String>();

        for(int i=0;i<count;i++){
            System.out.print("Enter name of student "+(i+1)+": ");
            String name=sc.next();
            students.add(i,name);
        }
           System.out.println(students);

        Iterator i=students.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
   
    }
}