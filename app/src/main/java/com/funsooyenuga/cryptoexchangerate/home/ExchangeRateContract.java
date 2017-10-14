package com.funsooyenuga.cryptoexchangerate.home;

import android.content.Context;

import com.funsooyenuga.cryptoexchangerate.data.Currency;

import java.util.List;

/**
 * Created by FAB THE GREAT on 14/10/2017.
 */

public interface ExchangeRateContract {

    interface View {

        void showExchangeRate(List<Currency> currencies);
    }

    interface Presenter {

        void subscribe(ExchangeRateContract.View view, Context context);

        void refreshExchangeRate();

        void unsubscribe();
    }
}