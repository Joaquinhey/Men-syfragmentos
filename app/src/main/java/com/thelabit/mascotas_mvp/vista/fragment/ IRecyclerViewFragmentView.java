package com.thelabit.mascotas_mvp;

import com.thelabit.mascotas_mvp.adapter.ContactoAdaptador;
import com.thelabit.mascotas_mvp.model.Contacto;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public ContactoAdaptador crearAdaptador(ArrayList<Contacto> contactos);

    public void inicializarAdaptadorRV(ContactoAdaptador adaptador);
}