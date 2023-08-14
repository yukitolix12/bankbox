public class Main {
    public static void main(String[] args){
        //KeyTypeの種類を選択
        StrongBox<String> sb = new StrongBox<>(KeyType.PADLOCK);
        //put()オブジェクトを金庫に入れる
        sb.put("鍵が開きました!");
        String rock = "";
        //KeyTypeによってループの試行回転数を変更
        for(int i = 0;i < 1024; i++){
            rock = sb.get();
        }
        if (rock != null){
            System.out.println(rock);
        } else {
            System.out.println("鍵は開いてません");
        }
    }
}
