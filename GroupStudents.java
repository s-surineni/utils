import java.util.Random;
class GroupStudents
	{
		String names[] = {"Renkila Harsha","Sravanthi Koola","Danish Hannan","Kaushik Sunny",
				"Shankar Kolluru","Nagaraju Katta","Lohit Salavadhi","Prashanth Nuthi",
				"Aravinda Kolla","Megha Narayana"};
		Random rdom = new Random();
		int turn = 0;
		String[] grp1,grp2;
		
		public static void main(String[] args)
		{
			GroupStudents gs = new GroupStudents();
			gs.begin();
		}
		void begin()
		{
			grp1 = new String[names.length/2];
			grp2 = new String[names.length - grp1.length];
			for(int i = 0 ; i < names.length ;i++ )
			{	
				int ind = chooseIndex();
				if(turn ==0)
				{
					grp1[i/2] = names[ind];
					turn++;
				}
				else
				{
					grp2[i/2]=names[ind];
					turn--;
				}	
				names[ind] = "done";	
				
			}
			displayGroups();
		} 
		
		int chooseIndex()
		{
			int ind;
			do
			{
				ind = rdom.nextInt(names.length); 
			}while(names[ind].equals("done"));
			return 	ind;
		}	
		
		void displayGroups()
		{
			System.out.println("Students in group 1 are:");
			display(grp1);
			System.out.println("Students in group 2 are:");
			display(grp2);
		}
		
		void display(String[] Arr) {
        		for (int trk = 0; trk < Arr.length; trk++) 
			{
				System.out.println(Arr[trk] + " ");
        		}
	}
}	 
