package com.example.lucky.renaissance17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.lucky.renaissance17.FlowingActivities.MainFlowingActivity;
import com.squareup.picasso.Picasso;

public class Sponsors extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32,i33,i34,i35,i36,i37,i38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        i1=(ImageView)findViewById(R.id.img1);
        i2=(ImageView)findViewById(R.id.img2);
        i3=(ImageView)findViewById(R.id.img3);
        i4=(ImageView)findViewById(R.id.img4);
        i5=(ImageView)findViewById(R.id.img5);
        i6=(ImageView)findViewById(R.id.img6);
        i7=(ImageView)findViewById(R.id.img7);
        i8=(ImageView)findViewById(R.id.img8);
        i9=(ImageView)findViewById(R.id.img9);
        i10=(ImageView)findViewById(R.id.img10);
        i11=(ImageView)findViewById(R.id.img11);
        i12=(ImageView)findViewById(R.id.img12);
        i13=(ImageView)findViewById(R.id.img13);
        i14=(ImageView)findViewById(R.id.img14);
        i15=(ImageView)findViewById(R.id.img15);
        i16=(ImageView)findViewById(R.id.img16);
        i17=(ImageView)findViewById(R.id.img17);
        i18=(ImageView)findViewById(R.id.img18);
        i19=(ImageView)findViewById(R.id.img19);
        i20=(ImageView)findViewById(R.id.img20);
        i21=(ImageView)findViewById(R.id.img21);
        i22=(ImageView)findViewById(R.id.img22);
        i23=(ImageView)findViewById(R.id.img23);
        i24=(ImageView)findViewById(R.id.img24);
        i25=(ImageView)findViewById(R.id.img25);
        i26=(ImageView)findViewById(R.id.img26);
        i27=(ImageView)findViewById(R.id.img27);
        i28=(ImageView)findViewById(R.id.img28);
        i29=(ImageView)findViewById(R.id.img29);
        i30=(ImageView)findViewById(R.id.img30);
        i31=(ImageView)findViewById(R.id.img31);
        i32=(ImageView)findViewById(R.id.img32);
        i33=(ImageView)findViewById(R.id.img33);
        i34=(ImageView)findViewById(R.id.img34);
        i35=(ImageView)findViewById(R.id.img35);
        i36=(ImageView)findViewById(R.id.img36);
        i37=(ImageView)findViewById(R.id.img37);
        i38=(ImageView)findViewById(R.id.img38);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/hindustan.gif")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                        // optional
                .into(i1);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/pustak.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)
                .into(i2);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/Juniper.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                      // optional
                .into(i3);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/kishori.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)
                .into(i4);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/logo.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                         // optional
                .into(i5);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/royal.gif")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)
                .into(i6);

        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/skiniti.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(300, 200)                        // optional
                .into(i7);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/om.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(300, 200)
                .into(i8);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/diamond.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i9);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/jaipur.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)
                .into(i10);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/burger.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)
                .into(i11);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/my.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                        // optional
                .into(i12);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/tripling.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                        // optional
                .into(i13);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/shubh.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i14);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/matrix.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                         // optional
                .into(i15);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/rat.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)
                .into(i16);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/8-min.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i17);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/appin.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                         // optional
                .into(i18);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/engiaca.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                         // optional
                .into(i19);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/yuwam.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                         // optional
                .into(i20);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/made.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)
                .into(i21);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/gate.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i22);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/Youstart.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                      // optional
                .into(i23);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/mutuals.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                        // optional
                .into(i24);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/cafe.jpeg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                         // optional
                .into(i25);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/g&g.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)
                .into(i26);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/hungeradda.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i27);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/dvaib.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i28);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/tc.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i29);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/hookmeup.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(300, 200)                        // optional
                .into(i30);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/fd.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)
                .into(i31);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/Sizzling.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i32);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/du.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                         // optional
                .into(i33);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/vi.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i34);

        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/festee.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i35);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/bisleri.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                          // optional
                .into(i36);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/kaya.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                        // optional
                .into(i37);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/logo/sponsors/new/sepoy.png")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(150, 100)                        // optional
                .into(i38);

    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(Sponsors.this,MainFlowingActivity.class);
        startActivity(i);
        super.onBackPressed();
    }
}
