
public class CheckLoadJDBC {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String msg = "";


	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	msg = "ドライバのロードに成功しました";
    }catch (ClassNotFoundException e){
    msg = "ドライバのロードに失敗しました";
    }System.out.println(msg);
	}

}
