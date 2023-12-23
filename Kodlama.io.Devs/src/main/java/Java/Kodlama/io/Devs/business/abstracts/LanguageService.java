package Java.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Java.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
void add(Language language) throws Exception;
void delete(int id);
void update(Language language) throws Exception;
List<Language> listAll();
void getWithId(int id);

}
