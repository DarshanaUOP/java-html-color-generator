/**
 * Created by acer on 04-Jun-17.
 */
public class Load{
    public static void main(String[] args) {
        int Red=0;
        int Green=0;
        int Blue=0;
		String upper="'";
		String line = "";
        System.out.println("<!DOCTYPE html>\n<html>\n<head>\n<title></title>\n</head>\n<body>");
        System.out.println("<table border="+1+" width="+100+"%> \n ");

        for(Red=0;Red<=4;Red++){
			
           for (Green=0;Green<=4;Green++){
			   
			   System.out.println("<tr>");
				for (Blue=0;Blue<=4;Blue++){
					
					line = "\t\t <td bgcolor="+upper+(Red==0 ? "00" :(Red==1 ? 40 : (Red==2 ? "80" : (Red==3 ? "BF":"FF"))))+(Green==0 ? "00" :(Green==1 ? 40 : (Green==2 ? "80" : (Green==3 ? "BF":"FF"))))+(Blue==0 ? "00" :(Blue==1 ? 40 : (Blue==2 ? "80" : (Blue==3 ? "BF":"FF"))))+upper+" height = '100' width = '100' "+ " >   R : "+Red +"  G : "+Green +" B :"+Blue +"  </td> \n";

					System.out.print(line);
					
				}
				Blue=0;
				//System.out.print("\t\t <td bgcolor="+upper+(Red==0 ? "00" :(Red==1 ? 40 : (Red==2 ? "80" : (Red==3 ? "BF":"FF"))))+(Green==0 ? "00" :(Green==1 ? 40 : (Green==2 ? "80" : (Green==3 ? "BF":"FF"))))+(Blue==0 ? "00" :(Blue==1 ? 40 : (Blue==2 ? "80" : (Blue==3 ? "BF":"FF"))))+upper+">"+"  R : "+Red +"  G : "+Green +" B :"+Blue +"  </td> \n");

				System.out.println("</tr>");
			
		   }
		   //System.out.print("\t\t <td bgcolor="+upper+(Red==0 ? "00" :(Red==1 ? 40 : (Red==2 ? "80" : (Red==3 ? "BF":"FF"))))+(Green==0 ? "00" :(Green==1 ? 40 : (Green==2 ? "80" : (Green==3 ? "BF":"FF"))))+(Blue==0 ? "00" :(Blue==1 ? 40 : (Blue==2 ? "80" : (Blue==3 ? "BF":"FF"))))+upper+">"+"  R : "+Red +"  G : "+Green +" B :"+Blue +"  </td> \n");

        }
        System.out.println("\n</body>\n</html>");

    }
}
