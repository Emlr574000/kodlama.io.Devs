package Java.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Java.Kodlama.io.Devs.dataAccess.abstracts.languageRepository;
import Java.Kodlama.io.Devs.entities.concretes.Language;

public class inMemoryLanguageRepository implements languageRepository {
	private List<Language> languages;
	public inMemoryLanguageRepository(List<Language> languages) {
		
		this.languages = languages;
		languages=new ArrayList<>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"Python"));
	}

	@Override
	public void add(Language language) {
		System.out.println("Yeni Programlama Dili eklendi : "+language.getLangName());
	}

	@Override
	public void delete(int id) {
		System.out.println("Programlama dili silindi Id : "+id);		
	}

	@Override
	public void update(Language language) {
		for (Language language1:languages) 
		{
			if(language1.getId()==language.getId())
				language1.setLangName(language1.getLangName());
		}
		
	}

	@Override
	public List<Language> listAll() {
		
		return languages;
	}

	@Override
	public void getWithId(int id) {
		for(Language language:languages)
			if(language.getId()==id)
		System.out.println("Getirildi Id : "+language);
		
	}

}
