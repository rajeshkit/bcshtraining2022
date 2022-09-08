package wordthreaddemo;

public class WordApplication {
	public static void main(String[] args) {
		TypeWord tw=new TypeWord();
		Thread typing=new Thread(tw,"typing");
		typing.start();
		
		SpellCheck sp=new SpellCheck();
		Thread check=new Thread(sp, "spellcheck");
		check.start();
		
		AutoSave as=new AutoSave();
		Thread save=new Thread(as, "save");
		save.start();
	}
}
