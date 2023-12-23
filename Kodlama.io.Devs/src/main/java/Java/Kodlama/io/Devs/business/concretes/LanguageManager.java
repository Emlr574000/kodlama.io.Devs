package Java.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Java.Kodlama.io.Devs.business.abstracts.LanguageService;
import Java.Kodlama.io.Devs.dataAccess.abstracts.languageRepository;
import Java.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	languageRepository languageRepository;
	List<Language> language = new ArrayList<>();;

	@Autowired
	public LanguageManager(languageRepository languageRepository, List<Language> languages) {

		this.language = languages;
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language language) throws Exception {
		if (language.getLangName().isEmpty()) {
			throw new Exception("Dil adı boş geçilemez.");
		}
		List<Language> language1 = languageRepository.listAll();
		for (Language fLanguage : language1) {
			if (language.equals(fLanguage)) {
				throw new Exception("Dil isimleri tekrar edemez");
			}

		}
		languageRepository.add(language);
	}

	@Override
	public void delete(int id) {
		
		languageRepository.delete(id);
		}

	

	@Override
	public void update(Language language) throws Exception {
		
		if (language.getLangName().isEmpty()) {
			throw new Exception("Dil adı boş geçilemez.");
		}
		
		for (Language fLanguage : listAll()) {
			if (language.equals(fLanguage)) {
				throw new Exception("Dil isimleri tekrar edemez");
			}
		}
		languageRepository.update(language);

	}

	@Override
	public List<Language> listAll() {
		

		return languageRepository.listAll();
	}

	@Override
	public void getWithId(int id) {

		languageRepository.getWithId(id);

	}

}
