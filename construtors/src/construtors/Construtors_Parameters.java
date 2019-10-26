package constructors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASTER-PC
 */
public class Construtors_Parameters {
   long modelNim;
  String modelName;
  String modelAlamat;
  String modelJurusan;
  long modelAngkatan;

  public Construtors_Parameters(long nim, String name, String Alamat, String Jurusan, long Angkatan) {
    modelNim = nim;
    modelName = name;
    modelAlamat = Alamat;
    modelJurusan = Jurusan;
    modelAngkatan = Angkatan;
    
  }

  public static void main(String[] args) {
    Construtors_Parameters myProfile = new Construtors_Parameters(201869040009L,"Asy'ari fandi ahmad","Gesing - Randupitu - Gempol","Teknik Informatika", 2018L);
    System.out.println (myProfile.modelNim );
    System.out.println (myProfile.modelName);  
    System.out.println (myProfile.modelAlamat);
    System.out.println (myProfile.modelJurusan);
    System.out.println (myProfile.modelAngkatan);
  }
  
} 

