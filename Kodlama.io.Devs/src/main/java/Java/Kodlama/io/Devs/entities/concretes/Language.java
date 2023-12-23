package Java.Kodlama.io.Devs.entities.concretes;

public class Language {//Programlama dillerini tutacağım id,langName,
private int id;String langName;
public Language() {
	
}
public Language(int id, String langName) {
	
	this.id = id;
	this.langName = langName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLangName() {
	return langName;
}
public void setLangName(String langName) {
	this.langName = langName;
}




}
