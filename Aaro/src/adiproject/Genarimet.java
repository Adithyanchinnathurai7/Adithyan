package adiproject;



public class Genarimet {

	public static void main(String[] args) {
		StudyRoom<Note> gno=new StudyRoom<>();
		Note note=new Note();
		Book boock=new Book();
		//gno.setObj(book);
		gno.setObj(note);
		
		//water=(Water)gno.getObj();
		//air=(Air)gno.getObj();
		note.write();
		//book.read();
		
	}

}
class Note
{
	public void write()
	{
		System.out.println("writing.....");
	}
}
class Book
{
	public void read()
	{
		System.out.println("reading.....");
	}
}
class StudyRoom<T>
{
	private T objt;
	
	public T getObj()
	{
		return this.objt;
	}
	public void setObj(T objt)
	{
		 this.objt=objt;
	}
}
