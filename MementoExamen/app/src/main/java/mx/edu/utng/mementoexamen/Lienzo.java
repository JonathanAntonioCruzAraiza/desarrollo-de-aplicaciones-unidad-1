package mx.edu.utng.mementoexamen;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by jony on 8/9/2016.
 */
public class Lienzo extends View {

    private Estrella estrella;

    public Lienzo(Context context, Estrella estrella){
        super(context);
        this.estrella = estrella;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estrella !=null){
            estrella.dibujar(canvas, estrella.getColor());
        }
    }

    public Estrella getEstrella() {
        return estrella;
    }

    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }
}
