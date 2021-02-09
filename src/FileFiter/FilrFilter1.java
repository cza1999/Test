package FileFiter;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

public class FilrFilter1 implements FileFilter {
    @Override
    public boolean accept(File pathname){
      if(pathname.isDirectory()){
          return  true;
      }
        return pathname.getName().toLowerCase().endsWith(".java");

    }

}
