package fileIO;

import java.io.File;
import java.util.Scanner;

public class FileInformation {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        boolean finished = false;
        while (!finished) {
            System.out.print ("Enter file name: ");
            String fileName = input.nextLine ();
            if ( !fileName.equals ( "" ) ) {
                File file = new File ( fileName );
            System.out.println ("Does it exist ?          " + file.exists ());
            System.out.println ("Is it a directory ?      " + file.isDirectory ());
            System.out.println ("Is it file ?             " + file.isFile ());
            System.out.println ("Is it file ?             " + file.isFile ());
            System.out.println ("Can it be read ?         " + file.canRead ());
            System.out.println ("File size:               " + file.length () + " bytes");
            System.out.println ("Can it be written ?      " + file.canWrite ());
            System.out.println ("It is hidden ?           " + file.isHidden ());
            System.out.println ("Last modified:           " + new java.util.Date (file.lastModified ()));
            System.out.println ("Full path name:          " + file.getAbsolutePath ());
                System.out.println ();
            } else {
                finished = true;
            }
        }
    }
}
