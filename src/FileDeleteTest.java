import java.io.File;

public class FileDeleteTest {
        //删除指定的文件
	public void clearFiles(String workspaceRootPath){
	     File file = new File(workspaceRootPath);
	     if(file.exists()){
	          deleteFile(file);
	     }
	}
        //如果是目录则删除目录下所有文件，否则删除文件
	public void deleteFile(File file){
	     if(file.isDirectory()){
	          File[] files = file.listFiles();
	          for(int i=0; i<files.length; i++){
	               deleteFile(files[i]);
	          }
	     }
	     file.delete();
	}
}