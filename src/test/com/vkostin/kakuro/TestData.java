package com.vkostin.kakuro;

class TestData {
  final static String PUZZLE____ = String.join("\n"
          ,"\\  3\\ 4\\ 6\\"
          ,"\\6 _   _   _"
          ,"\\7 _   _   _"
          );

  final  static  String SOLUTION____ = String.join("\r"
          ,"\\  3\\ 4\\ 6\\"
          ,"\\6 1   3   2"
          ,"\\7 2   1   4"
  );

  final static String PUZZLE___1 = String.join("\r\n"
          , "\\  4\\  9\\  \\   \\"
          , "\\4 _    _    21\\ \\"
          , "\\7 _    _    _    16\\"
          , "\\  \\23 _    _    _"
          , "\\  \\   \\16 _    _"
  );

  final static String SOLUTION___1 = String.join("\n\r"
          , "\\  4\\  9\\  \\   \\"
          , "\\4 3    1    21\\ \\"
          , "\\7 1    2    4    16\\"
          , "\\  \\23 6    8    9"
          , "\\  \\   \\16 9    7"
  );

  final static String PUZZLE___8 = String.join("\n"
          , "\\    \\  21\\  10\\     \\  \\"
          , "\\   8\\8  _     _     16\\ 4\\"
          , "\\22 _     _     _      _   _"
          , "\\13 _     _     5\\10  _   _"
          , "\\    \\    \\7  _      _    \\"
          , "\\    \\    \\4  _      _    \\"
  );

  final static String SOLUTION___8 = String.join("\n"
          , "\\    \\  21\\  10\\     \\  \\"
          , "\\   8\\8  5     3     16\\ 4\\"
          , "\\22 2     9     7      3   1"
          , "\\13 6     7     5\\10  7   3"
          , "\\    \\    \\7  2      5    \\"
          , "\\    \\    \\4  3      1    \\"
  );

  final static String PUZZLE__20 = String.join("\n"
          , "\\   5\\ 13\\   \\   \\  16\\ 8\\"
          , "\\5  _   _   15\\ 11\\16 _   _"
          , "\\28 _   _    _    _     _   _"
          , "\\    \\  \\4 _    _      \\  \\"
          , "\\   4\\ 3\\3 _    _     9\\ 4\\"
          , "\\24 _   _    _    _     _   _"
          , "\\4  _   _     \\   \\4  _   _"
  );

  final static String SOLUTION__20 = String.join("\n"
          , "\\   5\\ 13\\   \\   \\  16\\ 8\\"
          , "\\5  1   4   15\\ 11\\16 9   7"
          , "\\28 4   9    5    2     7   1"
          , "\\    \\  \\4 1    3      \\  \\"
          , "\\   4\\ 3\\3 2    1     9\\ 4\\"
          , "\\24 1   2    7    5     6   3"
          , "\\4  3   1     \\   \\4  3   1"
  );

  final static String PUZZLE__42 = String.join("\n"
          , "\\    \\  41\\ 6\\    \\    \\  33\\ 7\\"
          , "\\    \\14 _   _    11\\  16\\11 _   _"
          , "\\  14\\26 _   _     _     _     _   _"
          , "\\7  _     _    \\13 _     _     _   9\\"
          , "\\15 _     _   7\\  14\\    \\7  _   _"
          , "\\   8\\22 _   _     _    15\\10 _   _"
          , "\\37 _     _   _     _     _     _    \\"
          , "\\7  _     _    \\    \\12 _     _    \\"
  );

  final static String SOLUTION__42 = String.join("\n"
          , "\\    \\  41\\ 6\\    \\    \\  33\\ 7\\"
          , "\\    \\14 9   5    11\\  16\\11 6   5"
          , "\\  14\\26 4   1     7     9     3   2"
          , "\\7  5     2    \\13 4     7     2   9\\"
          , "\\15 9     6   7\\  14\\    \\7  1   6"
          , "\\   8\\22 8   5     9    15\\10 7   3"
          , "\\37 6     7   2     5     8     9    \\"
          , "\\7  2     5    \\    \\12 7     5    \\"
  );

  final static String PUZZLE__64 = String.join("\n"
          , "\\   7\\  36\\    \\   4\\  3\\  26\\    \\ \\"
          , "\\14 _     _    15\\11 _    _     _      \\ \\"
          , "\\27 _     _     _     _    _     _    36\\ \\"
          , "\\  14\\13 _     _    15\\ 11\\15 _     _ 11\\"
          , "\\7  _     _    23\\29 _    _     _     _ _"
          , "\\32 _     _     _     _    _    15\\16 _ _"
          , "\\    \\16 _     _   16\\  15\\16 _     _ 16\\"
          , "\\    \\    \\35 _     _    _     _     _ _"
          , "\\    \\    \\21 _     _    _      \\11 _ _"
  );

  final static String SOLUTION__64 = String.join("\n"
          , "\\   7\\  36\\    \\   4\\  3\\   26\\    \\ \\"
          , "\\14 5     9    15\\11 1    2      8      \\ \\"
          , "\\27 2     4     8     3    1      9    36\\ \\"
          , "\\  14\\13 6     7    15\\ 11\\15  7     8 11\\"
          , "\\7  5     2    23\\29 8     9     2     6 4"
          , "\\32 9     8     6     7     2    15\\16 9 7"
          , "\\    \\16 7     9    16\\  15\\16 9     7 16\\"
          , "\\    \\    \\35 3     7     8     6     2 9"
          , "\\    \\    \\21 5     9     7      \\11 4 7"
  );

  final static String PUZZLE__86 = String.join("\n"
          , "\\   4\\  8\\    \\    \\   3\\ 22\\   \\    \\   \\"
          , "\\3  _    _    10\\   6\\10 _    _     \\    \\   \\"
          , "\\24 _    _     _     _     _    _    4\\    \\   \\"
          , "\\  21\\ 18\\10 _     _    13\\3 _    _    10\\ 17\\"
          , "\\16 _    _      \\  26\\27 _    _    _     _    _"
          , "\\12 _    _    12\\12 _     _    _     \\4  _    _"
          , "\\23 _    _     _     _     _   11\\ 12\\9  _    _"
          , "\\    \\   \\17 _     _    13\\9 _    _    12\\  5\\"
          , "\\    \\   \\   \\31  _     _    _    _     _    _"
          , "\\    \\   \\   \\5   _     _     \\   \\12 _    _"
  );

  final static String SOLUTION__86 = String.join("\n"
          , "\\   4\\  8\\    \\    \\   3\\ 22\\   \\    \\   \\"
          , "\\3  1    2    10\\   6\\10 1    9     \\    \\   \\"
          , "\\24 3    6     1     5     2    7    4\\    \\   \\"
          , "\\  21\\ 18\\10 9     1    13\\3 2    1    10\\ 17\\"
          , "\\16 7    9      \\  26\\27 9    1    3     6    8"
          , "\\12 5    7    12\\12 8     1    3     \\4  1    3"
          , "\\23 9    2     4     5     3   11\\ 12\\9  3    6"
          , "\\    \\   \\17 8     9    13\\9 5    4    12\\  5\\"
          , "\\    \\   \\   \\31  3     9    6    8     4    1"
          , "\\    \\   \\   \\5   1     4     \\   \\12 8    4"
  );

  final static String PUZZLE_108 = String.join("\n"
          , "\\  16\\  20\\  \\    \\    \\   5\\ 22\\    \\   8\\ 14\\"
          , "\\14 _     _  15\\    \\    \\8  _    _     7\\10 _    _"
          , "\\18 _     _   _    13\\  22\\23 _    _     _     _    _"
          , "\\   8\\23 _   _     _     _    12\\3 _     _    26\\  6\\"
          , "\\8  _     _    \\29 _     _     _    _     _     _    _"
          , "\\12 _     _    \\  13\\9  _     _     \\  24\\13 _    _"
          , "\\    \\  22\\ 6\\13 _     _      \\   \\13 _     _     \\"
          , "\\    \\22 _   _     _     _      \\ 12\\14 _     _     \\"
          , "\\  17\\5  _   _      \\   7\\  12\\9 _     _    10\\ 17\\"
          , "\\17 _     _    \\    \\30 _     _    _     _     _    _"
          , "\\9  _     _    \\    \\15 _     _     \\    \\17 _    _"
  );

  final static String SOLUTION_108 = String.join("\n"
          , "\\  16\\  20\\  \\    \\    \\   5\\ 22\\    \\   8\\ 14\\"
          , "\\14 9     5  15\\    \\    \\8  1    7     7\\10 1    9"
          , "\\18 7     2   9    13\\  22\\23 4    6     1     7    5"
          , "\\   8\\23 1   6     7     9    12\\3 1     2    26\\  6\\"
          , "\\8  5     3    \\29 6     3     5    8     4     2    1"
          , "\\12 3     9    \\  13\\9  2     7     \\  24\\13 8    5"
          , "\\    \\  22\\ 6\\13 6     7      \\   \\13 6     7     \\"
          , "\\    \\22 9   5     7     1      \\ 12\\14 5     9     \\"
          , "\\  17\\5  4   1      \\   7\\  12\\9 5     4    10\\ 17\\"
          , "\\17 9     8    \\    \\30 1     3    7     9     2    8"
          , "\\9  8     1    \\    \\15 6     9     \\    \\17 8    9"
  );

}
