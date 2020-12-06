package cl.stomas.gol_proyect;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.SyncStateContract;

import java.util.ArrayList;
import java.util.List;

import cl.stomas.gol_proyect.Entidades.Canchas_Model;


public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    public static final String NOMBRE_BD ="Gol_BD";
    public static final int Version_BD= 1;
    public static final String TABLA_CANCHAS=
            "CREATE TABLE CANCHAS(ID_CANCHA INTEGER PRIMARY KEY AUTOINCREMENT, NOMBRE_CAN TEXT, DIRECION TEXT, CIUDAD TEXT, REGION TEXT, CONTACTO TEXT, HORARIO TEXT, PRECIO INTEGER, IMAGEN INTEGER)";

    public ConexionSQLiteHelper(Context context) {
        super(context, NOMBRE_BD, null, Version_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_CANCHAS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase , int i, int i1) {
        sqLiteDatabase.execSQL( "DROP TABLE IF EXISTS " +TABLA_CANCHAS);
        sqLiteDatabase.execSQL(TABLA_CANCHAS);

    }

    public void Anadir_Canchas(String nombre_can, String direcion, String ciudad, String region, String contacto, String horario, int precio){
        SQLiteDatabase db= getWritableDatabase();
        if(db!=null){
            db.execSQL(" INSERT INTO CANCHAS VALUES('"+nombre_can+"','"+direcion+"','"+ciudad+"','"+region+"','"+contacto+"','"+horario+"','"+precio+"')");
            db.close();
        }

    }

//metodo para obtener lista de canchas.
    public List<Canchas_Model> obtenerCanchas(){
        SQLiteDatabase bd=getReadableDatabase();
        Cursor cursor=bd.rawQuery("Select * from TABLA_CANCHAS" , null);
        List<Canchas_Model> canchas_models= new ArrayList<>();
        if(cursor.moveToFirst()){
            do{
                        canchas_models.add(new Canchas_Model(Integer.parseInt(cursor.getString(0)),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        Integer.parseInt(cursor.getString(7)),
                        Integer.parseInt(cursor.getString(8))
                        )
                        );


            }while (cursor.moveToNext());
            }
        return canchas_models;
        }

    }

   /* public ArrayList llenar_canchas(){
        ArrayList<String> lista_canchas = new ArrayList<>();
        SQLiteDatabase database= this.getReadableDatabase();
        return lista_canchas;
    }*/
