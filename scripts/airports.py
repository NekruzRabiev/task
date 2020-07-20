import re

with open('airports.txt', encoding='utf-8') as out, open ('demo_airports.txt', 'w', encoding='utf-8') as input:
    for line in out:
        line = line.strip()
        if re.search(r'\\N', line):
            line = re.sub(r'\\N', '""', line)
        input.write(line + '\n')