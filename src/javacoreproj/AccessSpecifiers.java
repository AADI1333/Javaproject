package javacoreproj;

public class AccessSpecifiers {

	public static void main(String[] args) {
		package javacoreproj;

		public class AccessModifiersDemo {

		    public static void main(String[] args) {
		        // Create instances of classes to test access modifiers
		        PublicClass publicClass = new PublicClass();
		        DefaultClass defaultClass = new DefaultClass();
		        PrivateClass privateClass = new PrivateClass();
		        SubclassOfPrivateClass subclass = new SubclassOfPrivateClass();

		        // Access members from various classes
		        System.out.println("Accessing members from different classes:");
		        
		        // Public members are accessible from anywhere
		        System.out.println("Public Class: " + publicClass.publicField);
		        publicClass.publicMethod();
		        
		        // Default members are accessible within the same package
		        System.out.println("Default Class: " + defaultClass.defaultField);
		        defaultClass.defaultMethod();

		        // Private members are only accessible within the same class
		        // Uncommenting the next line would result in a compilation error:
		        // System.out.println("Private Class: " + privateClass.privateField);
		        privateClass.privateMethod();

		        // Subclass can access protected members from superclass
		        System.out.println("Subclass of Private Class (Protected Member): " + subclass.protectedField);
		        subclass.protectedMethod();
		    }
		}

		class PublicClass {
		    public int publicField = 10;
		    public void publicMethod() {
		        System.out.println("Public method called.");
		    }
		}

		class DefaultClass {
		    int defaultField = 20;
		    void defaultMethod() {
		        System.out.println("Default method called.");
		    }
		}

		class PrivateClass {
		    private int privateField = 30;
		    private void privateMethod() {
		        System.out.println("Private method called.");
		    }
		}

		class SubclassOfPrivateClass extends PrivateClass {
		    void protectedMethod() {
		        System.out.println("Protected method called.");
		    }
		}


	}

}
