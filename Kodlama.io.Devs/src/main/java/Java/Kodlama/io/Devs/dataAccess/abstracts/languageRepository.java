package Java.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Java.Kodlama.io.Devs.entities.concretes.Language;

public interface languageRepository {
void add(Language language);
void delete(int id);
void update(Language language);
List<Language> listAll();
void getWithId(int id);
}
