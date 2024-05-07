package StringBuffer;

public class StringBuffer_Me {
    public static void main(String[] args) {

//        StringBuffer stringBuffer = new StringBuffer();
//        System.out.println(stringBuffer.capacity());
//        System.out.println(stringBuffer.length());

//        stringBuffer.ensureCapacity(16);
//        System.out.println(stringBuffer.capacity());
//        System.out.println(stringBuffer.length());

////        System.out.println(stringBuffer.append("Ganesh"));
////        System.out.println(stringBuffer.append("Mohit"));
//        StringBuffer l = stringBuffer.delete(1, 3);
//        System.out.println(l);


        StringBuffer stringBuffer1 = new StringBuffer(20);
//        System.out.println(stringBuffer1.capacity());

        stringBuffer1.append(" ");
        stringBuffer1.append("Ganesh");
//        System.out.println(stringBuffer1.length());
//        stringBuffer1.ensureCapacity(40);
//        System.out.println(stringBuffer1.capacity());
//        System.out.println(stringBuffer1.delete(0,4));
//        System.out.println(stringBuffer1.deleteCharAt(1));

        System.out.println(stringBuffer1.insert(0, "Ganesh Kushwah Mohanpur"));
        System.out.println(stringBuffer1);

        stringBuffer1.replace(0, 10, "Charan Kushwah");
        System.out.println(stringBuffer1);

        System.out.println(stringBuffer1.reverse());
        stringBuffer1.trimToSize();
        stringBuffer1.setCharAt(0, 'k');
        System.out.println(stringBuffer1);
        stringBuffer1.lastIndexOf("hahha");
        stringBuffer1.compareTo(new StringBuffer());
        stringBuffer1.setLength(60);
        System.out.println(stringBuffer1);
    }
}
