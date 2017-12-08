package ex4_work;

public class InfoManager {

	private InsertInfo insert;
	private DeleteInfo delete;
	private ShowInfo show;
	
	public void PersonManager() {
		
		insert = new InsertInfo();
		delete = new DeleteInfo();
		show = new ShowInfo();
	}

	public InsertInfo getInsert() {
		return insert;
	}

	public void setInsert(InsertInfo insert) {
		this.insert = insert;
	}

	public DeleteInfo getDelete() {
		return delete;
	}

	public void setDelete(DeleteInfo delete) {
		this.delete = delete;
	}

	public ShowInfo getShow() {
		return show;
	}

	public void setShow(ShowInfo show) {
		this.show = show;
	}
	
	
	
	
}
