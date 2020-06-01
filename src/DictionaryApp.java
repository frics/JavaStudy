//Chap5_10-추상메소드_예제


abstract class PairMap{
    protected String keyArray[];
    protected String valueArray[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap{
    private int items;
    Dictionary(int size){
        keyArray = new String[size];
        valueArray = new String[size];
    }
    @Override
    public String get(String key){ //key 값을 가진 value return, 없으면 null;
        for(int i=0; i<items; i++) {
            if (keyArray[i].equals(key))
                return valueArray[i];
        }
        return null;
    }
    public void put(String key, String value) { //key와 value저장, 기존에 key가 있으면 value값 수정
        if(items == keyArray.length){ //배열이 꽉찼을때
            System.out.println("배열이 꽉찼습니다. "+key+"와"+value+"가 저정되지 않습니다.");
            return;
        }
        for (int i = 0; i < items; i++) {
            if (keyArray[i].equals(key)) {//이미 값이 있는 경우 value값만 바꾸고 return
                valueArray[i] = value;
                return;
            }
        }
        keyArray[items] = key; //동일한 key가 없으면 새로 추가
        valueArray[items] = value;
        items++;

    }
    @Override
    public String delete(String key){ //key값과 match되는 value값 삭제된 value값 return
        for(int i=0; i<items; i++){
            if (keyArray[i].equals(key)){
                String tmp = valueArray[i]; //삭제할 value를 return하기 위해 저장
                items--; //총 아이템 개수 감소
                keyArray[i] = keyArray[items]; //맨 마지막 아이템을 삽입하여 배열 공간 효율 증가
                valueArray[i] = valueArray[items];
                return tmp;
            }
        }
        return key+"는(은) 없는 항목입니다."; //삭제하고자 하는 key가 없는 경우

    }
    public int length(){
        return items; //현재까지 저장된 아이템 개수 return
    }
}


public class DictionaryApp {
    public static void main(String[] args){
        Dictionary dic = new Dictionary(5);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 "+ dic.get("이재문"));
        System.out.println("황기태의 값은 "+ dic.get("황기태"));
        System.out.println(dic.delete("최승서"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+ dic.get("황기태"));
    }

}
