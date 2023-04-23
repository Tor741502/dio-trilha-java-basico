import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número de prótons:");
        int atomicNumber = scanner.nextInt();
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o número de nêutrons:");
        int neutrons = scanner2.nextInt();
        
        int atomicMass = atomicNumber + neutrons;
        String elementSymbol = getElementSymbol(atomicNumber);
        
        System.out.println("Número atômico: " + atomicNumber);
        System.out.println("Número de massa: " + atomicMass);
        System.out.println("Elemento químico: " + elementSymbol);
    }
    
    public static String getElementSymbol(int atomicNumber) {
        String[] elementSymbols = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"};
        
        return elementSymbols[atomicNumber - 1];
    }
}

