package sub08;

class person{
	private String pid;
	private String name;
	private int age;
	
	public String getpid() {return pid;}
	public String getName() {return name;}
	public int getAge() {return age;}
	
	public person(String pid, String name, int age) {
		this.age=age;
		this.name=name;
		this.pid=pid;
	}
	
	@Override
	public String toString() {
		return String.format(name, null);
	}
	
}

class PersonMap{
	private Map<String, Person> persons;
	
	public PersonMap() {
		persons = new HashMap<>();
	}
	
	public void addPerson(Person p) {
		persons.put(p.getPid(),p);
	}
	
	
	public boolean removePerson(String uid) {
		if(persons.containsKey(uid)) {
			persons.remove(uid);
			return true;
		}
		System.out.printf("아이디 '%s' 가 존재하지 않습니다.\n", uid);
		return false;
	}
	
	public void showAllPersons() {
		for(Person p : persons.values()) {
			System.out.println(p);
		}
	}
}

public class _08 {
	public static void main(String[] args) {
		
		PersonMap map = new PersonMap();
		
		Person p1 = new Person("a101", "김유신",23);
		
		map.addPerson(p1);
		
		map.removePerson("kim");
		
		map.showAllPersons();
	}
}
