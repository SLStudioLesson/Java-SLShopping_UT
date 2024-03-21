package com.example.slshopping_ut.user;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    /** モック化したクラス */
    @Mock
    private UserRepository mockUserRepository;

    /** テスト対象クラスにモックを注入 */
    @InjectMocks
    private  UserService target;

    /**
     * 【概要】
     * 管理者を検索<br>
     *
     * 【条件】
     * userServiceのlistAllメソッドにnullを渡すこと<br>
     * userRepositoryのfindAllメソッドはUserのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Userのリストを返却すること
     */
    @Test
    void testListAll_argumentIsNull() {

    }

    /**
     * 【概要】
     * 管理者を検索<br>
     *
     * 【条件】
     * userServiceのlistAllメソッドに空文字を渡すこと<br>
     * userRepositoryのfindAllメソッドはUserのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Userのリストを返却すること
     */
    @Test
    void testListAll_argumentIsEmpty() {

    }

    /**
     * 【概要】
     * 管理者を検索<br>
     *
     * 【条件】
     * userServiceのlistAllメソッドにuserという文字列を渡すこと<br>
     * userRepositoryのsearchメソッドはUserのリストを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Userのリストを返却すること
     */
    @Test
    void testListAll_argumentIsNotEmpty() {

    }

   /**
     * 【概要】
     * 管理メールアドレスの重複チェック<br>
     *
     * 【条件】
     * userRepositoryのfindByEmailメソッドはnullを返すようスタブ化すること<br>
     *
     * 【結果】
     * trueを返すこと
     */
    @Test
    void testCheckUnique_noDuplication() {

    }

    /**
     * 【概要】
     * 管理メールアドレスの重複チェック<br>
     *
     * 【条件】
     * userRepositoryのfindByEmailメソッドはUserのインスタンスを返すようスタブ化すること<br>
     *
     * 【結果】
     * falseを返すこと
     */
    @Test
    void testCheckUnique_duplicate() {

    }

    /**
     * 【概要】
     * 管理者情報の取得<br>
     *
     * 【条件】
     * userRepositoryのfindByIdメソッドはUserのインスタンスを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * 例外が発生しないこと
     */
    @Test
    void testGet_noThrowsException() {

    }

    /**
     * 【概要】
     * 管理者情報の取得<br>
     *
     * 【条件】
     * userRepositoryのfindByIdメソッドはnullを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * 例外が発生すること
     */
    @Test
    void testGet_throwsException() {

    }

    /**
     * 【概要】
     * 管理者情報の取得処理の検証<br>
     *
     * 【条件】
     * userRepositoryのfindByIdはUserのインスタンスを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * Userを返却すること
     */
    @Test
    void testGet() throws Exception {

    }
}
