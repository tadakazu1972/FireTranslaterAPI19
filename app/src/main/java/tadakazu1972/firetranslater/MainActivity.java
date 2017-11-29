package tadakazu1972.firetranslater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {
    protected MainActivity mActivity = null;
    protected View mView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.activity_main);
        //ボタン初期化
        initButtons();
    }

    private void initButtons(){
        //英語
        mView.findViewById(R.id.btnEnglish).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　英語＝1
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "1").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //中国語(簡体)
        mView.findViewById(R.id.btnChinese).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　中国語(簡体)＝2
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "2").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //韓国語
        mView.findViewById(R.id.btnKorean).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　韓国語＝3
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "3").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //中国語(繁体)
        mView.findViewById(R.id.btnTraditionalChinese).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　中国語(繁体)＝4
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "4").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //タイ語
        mView.findViewById(R.id.btnThai).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　タイ語＝5
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "5").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //タガログ語
        mView.findViewById(R.id.btnPhilippine).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　タガログ語＝6
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "6").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //フランス語
        mView.findViewById(R.id.btnFrench).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　フランス語＝7
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "7").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //インドネシア語
        mView.findViewById(R.id.btnIndonesia).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　インドネシア語＝8
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "8").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //ポルトガル語
        mView.findViewById(R.id.btnPortuguese).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　ポルトガル語＝9
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "9").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //ベトナム語
        mView.findViewById(R.id.btnVietnum).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　ベトナム語＝a
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "a").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //ドイツ語
        mView.findViewById(R.id.btnGermany).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　ドイツ語＝b
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "b").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //スペイン語
        mView.findViewById(R.id.btnEspanyol).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　スペイン語＝c
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "c").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //ロシア語
        mView.findViewById(R.id.btnRussian).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　ロシア語＝d
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "d").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
        //マレー語
        mView.findViewById(R.id.btnMalay).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　マレー語＝e
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "e").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });

        //日本語
        mView.findViewById(R.id.btnJapanese).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                //選択した言語番号保存　日本語＝0
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("language", "0").apply();
                //ホーム画面へ
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
