package com.example.practice_thirtydayapp.data

import com.example.practice_thirtydayapp.R
import com.example.practice_thirtydayapp.model.Haiku

object HaikuRepository{
    val haikus = listOf(
        Haiku("Arctic Companions", R.drawable.free_photo_of_primer_plano_de_dos_osos_polares_en_terreno_rocoso, "In twilight's embrace,\n" +
                "Two white giants share the snow,\n" +
                "Silent, yet so close."),
        Haiku("Summer Sanctuary", R.drawable.free_photo_of_madera_paisaje_naturaleza_verano, "Wooden home in fields,\n" +
                "Sun-kissed dreams and golden light,\n" +
                "Nature's warm embrace."),
        Haiku("Winter Serenity", R.drawable.free_photo_of_resfriado_frio_nieve_nevar, "Blanket of white falls,\n" +
                "Landscape of peace and cold calm,\n" +
                "Winter's silent grace."),
        Haiku("Culinary Delight", R.drawable.pexels_photo_7958250, "Colors on a plate,\n" +
                "Flavors dance in harmony,\n" +
                "A feast for the soul."),
        Haiku("Autumn Harvest Table", R.drawable.pexels_photo_23384639, "Pumpkins grace the board,\n" +
                "Orange hues and rustic charm,\n" +
                "Fall’s bounty displayed."),
        Haiku("Candlelit Elegance", R.drawable.pexels_photo_7958250, "Candles softly glow,\n" +
                "Whispers of light on the table,\n" +
                "Night's gentle embrace."),
    )
}
