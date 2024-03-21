package com.example.slshopping_ut.category;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CategoryServiceTest {

    /** モック化したクラス */
    @Mock
    private CategoryRepository mockCategoryRepository;

    /** テスト対象クラスにモックを注入 */
    @InjectMocks
    private CategoryService target;

    /**
     * 【概要】
     * カテゴリーのリストを取得<br>
     *
     * 【条件】
     * categoryRepositoryのfindAllメソッドはCategoryのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Categoryのリストを返却すること
     */
    @Test
    void testListAll() {

    }

    /**
     * 【概要】
     * カテゴリーを検索<br>
     *
     * 【条件】
     * categoryServiceのlistAllメソッドにnullを渡すこと<br>
     * categoryRepositoryのfindAllメソッドはCategoryのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Categoryのリストを返却すること
     */
    @Test
    void testListAll_argumentIsNull() {

    }

    /**
     * 【概要】
     * カテゴリーを検索<br>
     *
     * 【条件】
     * categoryServiceのlistAllメソッドに空文字を渡すこと<br>
     * categoryRepositoryのfindAllメソッドはCategoryのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Categoryのリストを返却すること
     */
    @Test
    void testListAll_argumentIsEmpty() {

    }

    /**
     * 【概要】
     * カテゴリーを検索<br>
     *
     * 【条件】
     * categoryServiceのlistAllメソッドにcategoryという文字列を渡すこと<br>
     * categoryRepositoryのsearchメソッドはCategoryのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Categoryのリストを返却すること
     */
    @Test
    void testListAll_argumentIsNotEmpty() {

    }

    /**
     * 【概要】
     * カテゴリー名の重複チェック<br>
     *
     * 【条件】
     * categoryRepositoryのfindByNameメソッドはnullを返すようスタブ化すること<br>
     *
     * 【結果】
     * trueを返すこと
     */
    @Test
    void testCheckUnique_noDuplication() {

    }

    /**
     * 【概要】
     * カテゴリー名の重複チェック<br>
     *
     * 【条件】
     * categoryRepositoryのfindByNameメソッドはCategoryのインスタンスを返却するようスタブ化すること<br>
     *
     * 【結果】
     * falseを返すこと
     */
    @Test
    void testCheckUnique_duplicate() {

    }

    /**
     * 【概要】
     * カテゴリー情報の取得<br>
     *
     * 【条件】
     * categoryRepositoryのfindByIdメソッドはCategoryのインスタンスを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * 例外が発生しないこと
     */
    @Test
    void testGet_noThrowsException() {

    }

    /**
     * 【概要】
     * カテゴリー情報の取得<br>
     *
     * 【条件】
     * categoryRepositoryのfindByIdメソッドはnullを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * 例外が発生すること
     */
    @Test
    void testGet_throwsException() {

    }

    /**
     * 【概要】
     * カテゴリー情報の取得処理の検証<br>
     *
     * 【条件】
     * categoryRepositoryのfindByIdはCategoryのインスタンスを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Categoryを返却すること
     */
    @Test
    void testGet() throws Exception {

    }
}
