import re

with open('airports.txt', encoding='utf-8') as out, open ('demo_airports.txt', 'w', encoding='utf-8') as input:
    for line in out:
        line = line.strip()
        if re.search(r'"",', line):
            line = re.sub(r'""', 'NULL', line)
        if re.search(r'\\N', line):
            line = re.sub(r'\\N', 'NULL', line)
        if re.search(r'\'', line):
            line = re.sub(r'\'', '\\\'', line)
        if re.search(r'"', line):
            line = re.sub(r'"', '\'', line)
        input.write('(' + line + '),\n')