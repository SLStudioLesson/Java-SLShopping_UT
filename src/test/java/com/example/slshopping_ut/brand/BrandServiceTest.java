package com.example.slshopping_ut.brand;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.slshopping_ut.entity.Brand;

/*
 * @SpringBootTest
 * 簡易版のテストはこのアノテーションを使う
 * @ExtendWith(MockitoExtension.class)と一緒には使えないためどちらか一方を利用する形となる
 */
@ExtendWith(MockitoExtension.class)
class BrandServiceTest {

    /** モック化したクラス */
    @Mock
    private BrandRepository mockBrandRepository;

    /** テスト対象クラスにモックを注入 */
    @InjectMocks
    private BrandService target;

    /**
     * 【概要】
     * ブランドのリストを取得<br>
     *
     * 【結果】
     * ブランドのリストを返却すること
     */
    @Test
    void testListAll() {
        List<Brand> expected = Arrays.asList(
            new Brand(1L, "brandA"),
            new Brand(2L, "brandB")
        );

        // スタブの設定
        doReturn(expected).when(this.mockBrandRepository).findAll();

        /* Lesson02 タスク -初級編- 課題1 */
        // 検証処理
    }

    /**
     * 【概要】
     * ブランド名の重複チェック<br>
     *
     * 【条件】
     * brandRepositoryのfindByNameメソッドはnullを返すようスタブ化すること<br>
     *
     * 【結果】
     * trueを返すこと
     */
    @Test
    void testCheckUnique_noDuplication() {
        // ブランド名が重複していないブランド情報を作成
        Brand newBrand = new Brand(1L, "brandA");

        // スタブの設定
        doReturn(null).when(this.mockBrandRepository).findByName(anyString());

        /* Lesson02 タスク -初級編- 課題2 */
        // 検証処理
    }

    /**
     * 【概要】
     * ブランド情報の取得<br>
     *
     * 【条件】
     * brandRepositoryのfindByIdメソッドはnullを格納したOptionalを返却するようスタブ化すること<br>
     *
     * 【結果】
     * 例外が発生すること
     */
    @Test
    void testGet_throwsException() {
        // 準備 テストデータに存在しないID
        Long id = 1000L;

        // スタブに設定するデータを作成
        Optional<Brand> brand = Optional.ofNullable(null);

        //スタブの設定
        doReturn(brand).when(this.mockBrandRepository).findById(id);

        /* Lesson02 タスク -初級編- 課題3 */
        // 検証処理
    }
}
