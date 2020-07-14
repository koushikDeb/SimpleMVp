

package com.koushik.simplemvp.main;

import java.util.List;

class MainPresenter {

    private MainView mainView;
    private FindItemsInteractor findItemsInteractor;

    MainPresenter(MainView mainView, FindItemsInteractor findItemsInteractor) {
        this.mainView = mainView;
        this.findItemsInteractor = findItemsInteractor;
    }

    void onResume() {
        if (mainView != null) {
           //write on resume operation
        }

    }

    void onItemClicked(String item) {
        if (mainView != null) {
            mainView.showMessage(String.format("%s clicked", item));
        }
    }

    void onDestroy() {
        mainView = null;
    }

    public void onFinished(List<ItemModel> items) {
        if (mainView != null) {
            mainView.setItems(items);
            mainView.hideProgress();
        }
    }

    public MainView getMainView() {
        return mainView;
    }

    public void addItem(List<ItemModel> itemlist) {
        mainView.showProgress();
        findItemsInteractor.findItems(this::onFinished,itemlist);
    }
}
