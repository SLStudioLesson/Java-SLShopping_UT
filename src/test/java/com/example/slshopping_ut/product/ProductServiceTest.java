package com.example.slshopping_ut.product;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    /** モック化したクラス */
    @Mock
    private ProductRepository mockProductRepository;

    /** テスト対象クラスにモックを注入 */
    @InjectMocks
    private ProductService target;

    /**
     * 【概要】
     * 商品のリストを取得<br>
     *
     * 【条件】
     * productRepositoryのfindAllメソッドはProductのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Productのリストを返却すること
     */
    @Test
    void testListAll() {

    }

    /**
     * 【概要】
     * 商品を検索<br>
     *
     * 【条件】
     * productServiceのlistAllメソッドにnullを渡すこと<br>
     * productRepositoryのfindAllメソッドはProductのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Productのリストを返却すること
     */
    @Test
    void testListAll_argumentIsNull() {

    }

    /**
     * 【概要】
     * 商品を検索<br>
     *
     * 【条件】
     * productServiceのlistAllメソッドに空文字を渡すこと<br>
     * productRepositoryのfindAllメソッドはProductのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Productのリストを返却すること
     */
    @Test
    void testListAll_argumentIsEmpty() {

    }

    /**
     * 【概要】
     * 商品を検索<br>
     *
     * 【条件】
     * productServiceのlistAllメソッドにproductという文字列を渡すこと<br>
     * productRepositoryのsearchメソッドはProductのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Productのリストを返却すること
     */
    @Test
    void testListAll_argumentIsNotEmpty() {

    }

    /**
     * 【概要】
     * 商品名の重複チェック<br>
     *
     * 【条件】
     * productRepositoryのfindByNameメソッドはnullを返すようスタブ化すること<br>
     *
     * 【結果】
     * trueを返すこと
     */
    @Test
    void testCheckUnique_noDuplication() {

    }

    /**
     * 【概要】
     * 商品名の重複チェック<br>
     *
     * 【条件】
     * productRepositoryのfindByNameメソッドはProductのインスタンスを返却するようスタブ化すること<br>
     *
     * 【結果】
     * falseを返すこと
     */
    @Test
    void testCheckUnique_duplicate() {

    }

    /**
     * 【概要】
     * 商品情報の取得<br>
     *
     * 【条件】
     * productRepositoryのfindByIdメソッドはProductのインスタンスを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * 例外が発生しないこと
     */
    @Test
    void testGet_noThrowsException() {

    }

    /**
     * 【概要】
     * 商品情報の取得<br>
     *
     * 【条件】
     * productRepositoryのfindByIdメソッドはnullを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * 例外が発生すること
     */
    @Test
    void testGet_throwsException() {

    }

    /**
     * 【概要】
     * 商品情報の取得処理の検証<br>
     *
     * 【条件】
     * productRepositoryのfindByIdはProductのインスタンスを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Productを返却すること
     */
    @Test
    void testGet() throws Exception {

    }
}
