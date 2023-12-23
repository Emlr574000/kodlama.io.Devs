package Java.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Java.Kodlama.io.Devs.entities.concretes.Language;

public interface languageRepository {
void add(Language language);/*Neden Language türünde birşey çağırıp
daha sonra id üzerinden işlem yapıyoruz. Çünkü databasede yeri olmayan 
Id si de olmaz yani ister istemez Language tipine ekleme kısmında 
ihtiyacımız var.*/
void delete(int id);
void update(Language language);
List<Language> listAll();
void getWithId(int id);
}
